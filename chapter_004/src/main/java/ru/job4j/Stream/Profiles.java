package ru.job4j.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles implements Comparator<Address> {
    public List<Address> collect(List<Profile> profiles) {
//        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());

//        return profiles.stream().map(Profile::getAddress).sorted().distinct().collect(Collectors.toList());

        return profiles.stream().map(Profile::getAddress).sorted(Comparator.comparing(address -> address.getCity())).distinct().collect(Collectors.toList());

//        return profiles.stream().map(Profile::getAddress).sorted(Comparator<Address>()).distinct().collect(Collectors.toList());
    }

    @Override
    public int compare(Address o1, Address o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}