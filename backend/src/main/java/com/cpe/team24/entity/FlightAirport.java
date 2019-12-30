package com.cpe.team24.entity;

import lombok.*;

import javax.persistence.*;

import java.util.Collection;


@Data
@Entity
// @NoArgsConstructor
@Table(name="FLIGHTAIRPORT")
public class FlightAirport {
    @Id
    // @SequenceGenerator(name="FLIGHT_AIRPORT_SEQ",sequenceName="FLIGHT_AIRPORT_SEQ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name="FLIGHT_AIRPORT_ID",unique = true, nullable = true)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private FAir name;

    public FlightAirport(){}
    public FlightAirport(FAir name){
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public FAir getName() {
        return this.name;
    }

    public void setName(FAir name) {
        this.name = name;
    }


   @ManyToOne(fetch = FetchType.EAGER, targetEntity = FlightCity.class)
   @JoinColumn(name = "FIGHT_CITY_ID", insertable = true)
   private FlightCity city;

//    @OneToMany(fetch = FetchType.EAGER)
//    // mappedBy  = "from"
//    private Collection<Fight> flight;

//    @OneToMany(fetch = FetchType.EAGER)
//    // mappedBy  = "to"
//    private Collection<Fight> flight;

}