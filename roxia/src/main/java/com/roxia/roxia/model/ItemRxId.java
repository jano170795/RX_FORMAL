package com.roxia.roxia.model;

import java.io.Serializable;

public record ItemRxId(
        String idRoxia,
        String idOem,
        int yearReg,
        String roxiaDescription
) implements Serializable {}