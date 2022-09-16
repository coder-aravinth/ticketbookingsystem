package com.ticketing.bs.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "ticket")
@IdClass(TicketPk.class)
public class Ticket {
    @Id
    @Column(name = "ticket_id", nullable = false)
    private Long id;

    @ManyToOne
    @Id
    @JoinColumn(name = "screen_id",referencedColumnName = "id")
    private Screen screen;

    @ManyToOne
    @Id
    @JoinColumn(name = "theatre_id",referencedColumnName = "id")
    private Theatre theatre;

    private boolean isBooked;

    @OneToOne
    @JoinColumn(name = "booked_user_id",referencedColumnName = "id")
    private User user;

}