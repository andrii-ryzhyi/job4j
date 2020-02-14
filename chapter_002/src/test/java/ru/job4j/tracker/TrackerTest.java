package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.IsNull.nullValue;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenItemAdd() {
        Item item1 = new Item("Item 1");
        Tracker tracker = new Tracker();

        String expected = item1.getName();
        String result = tracker.add(item1).getName();

        Assert.assertThat(result, is(expected));

    }
    @Test
    public void whenFoundAll() {
        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");
        Item item4 = new Item("Item 4");
        Item item5 = new Item("Item 5");
        Item item6 = new Item("Item 6");
        Item item7 = new Item("Item 7");
        Tracker tracker = new Tracker();

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.add(item6);
        tracker.add(item7);

        Item[] expected = new Item[] {
                item1,
                item2,
                item3,
                item4,
                item5,
                item6,
                item7
        };
        Item[] result = tracker.findAll();
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenFoundByName() {
        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");
        Item item4 = new Item("Item 4");
        Item item5 = new Item("Item 5");
        Item item6 = new Item("Item 1");
        Item item7 = new Item("Item 1");
        Tracker tracker = new Tracker();

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        tracker.add(item6);
        tracker.add(item7);

        Item[] expected = new Item[] {
                item1,
                item6,
                item7
        };
        Item[] result = tracker.findByName("Item 1");
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenFoundById() {
        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");
        Item item4 = new Item("Item 4");
        Item item5 = new Item("Item 5");
        Item item6 = new Item("Item 1");
        Item item7 = new Item("Item 1");
        Tracker tracker = new Tracker();

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3).setId("333");
        tracker.add(item4);
        tracker.add(item5);
        tracker.add(item6);
        tracker.add(item7);

        Item expected = item3;
        Item result = tracker.findById("333");
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenNotFoundById() {
        Item item1 = new Item("Item 1");
        Item item2 = new Item("Item 2");
        Item item3 = new Item("Item 3");
        Item item4 = new Item("Item 4");
        Item item5 = new Item("Item 5");
        Item item6 = new Item("Item 1");
        Item item7 = new Item("Item 1");
        Tracker tracker = new Tracker();

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3).setId("333");
        tracker.add(item4);
        tracker.add(item5);
        tracker.add(item6);
        tracker.add(item7);

        Item expected = null;
        Item result = tracker.findById("777");
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}
