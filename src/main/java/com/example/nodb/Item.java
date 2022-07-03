package com.example.nodb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class Item {
    @NonNull
    public Number id;
    @NonNull
    public String name;
}
