package com.jeddi.belajarspring.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicC {
    private CyclicA cyclicA;
}
