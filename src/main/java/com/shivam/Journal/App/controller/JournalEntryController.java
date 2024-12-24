package com.shivam.Journal.App.controller;

import com.shivam.Journal.App.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long , JournalEntry> JournalEntries = new HashMap<>();

    @GetMapping("/journalList")
    public List<JournalEntry> getAll () {
        return new ArrayList<>(JournalEntries.values());
    }

   @PostMapping("/createEntry")
    public String CreateEntries(@RequestBody JournalEntry myEntry) {
       JournalEntries.put(myEntry.getId(),myEntry);
         return "Success";
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalById(@PathVariable Long myId){
        return JournalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalById(@PathVariable Long myId){
        JournalEntries.remove(myId);
        return true;
    }
}
