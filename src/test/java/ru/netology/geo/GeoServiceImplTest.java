package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

class GeoServiceImplTest {
    @Test
    public void testByIpRussia() {
        GeoService geoService = new GeoServiceImpl();
        Country actual = geoService.byIp("172.").getCountry();
        Country expected = new Location(null, Country.RUSSIA, null, 0).getCountry();
        Assertions.assertEquals(actual,expected);

    }

    @Test
    public void testByIpUSA() {
        GeoService geoService = new GeoServiceImpl();
        Country actual = geoService.byIp("96.").getCountry();
        Country expected = new Location(null, Country.USA, null, 0).getCountry();
        Assertions.assertEquals(actual,expected);
    }
}