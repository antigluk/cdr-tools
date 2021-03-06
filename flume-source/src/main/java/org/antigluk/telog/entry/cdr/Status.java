package org.antigluk.telog.entry.cdr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Status {
    ANSWERED,
    NOTANSWERED,
    NORING;

    private static final List<Status> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Status randomStatus()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}