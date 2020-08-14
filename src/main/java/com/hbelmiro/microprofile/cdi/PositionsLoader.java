package com.hbelmiro.microprofile.cdi;

import java.util.List;

public interface PositionsLoader {

    List<Position> load(String investorName);

}
