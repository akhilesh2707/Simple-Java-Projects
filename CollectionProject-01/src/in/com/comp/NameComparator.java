package in.com.comp;

import java.util.Comparator;

import in.com.entity.Person;

public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
