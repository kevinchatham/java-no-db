package com.example.nodb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public final class Item {
    @NonNull
    public final Number id;
    @NonNull
    public final String name;
}
