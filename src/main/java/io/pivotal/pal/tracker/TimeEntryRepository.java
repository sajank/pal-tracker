package io.pivotal.pal.tracker;

import java.util.List;

/**
 * Created by sajan.khandelwal on 8/2/2017.
 */
public interface  TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry find(Long id);
    List<TimeEntry> list();
    TimeEntry update(Long id, TimeEntry timeEntry);
    void delete(Long id);
}
