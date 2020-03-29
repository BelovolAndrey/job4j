package ru.job4j.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
//        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
//        return profiles.stream().map(Profile::getAddress).sorted().distinct().collect(Collectors.toList());
//        return profiles.stream().map(Profile::getAddress).sorted(Comparator.comparing(address -> address.getCity())).distinct().collect(Collectors.toList());

        return profiles.stream().map(Profile::getAddress).sorted(new ComparAdress()).distinct().collect(Collectors.toList());
    }
}