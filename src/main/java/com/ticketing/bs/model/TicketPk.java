package com.ticketing.bs.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class TicketPk  implements Serializable {
    private Long id;
    private Long theatre;
    private Long screen;
}
