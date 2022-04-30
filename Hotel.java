package sample.mybatis.xml.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Hotel implements Serializable {

  private static final long serialVersionUID = 1L;

  private final Long city;

  private final String name;

  private final String address;

  private final String zip;

  private List<Habitacion> habitaciones;

  public static void main(String[] args) {

		Hotel hotel = Hotel.builder().city(1L).name("Conrad Treasury Place").address("William & George Streets").zip("4001").build();

		hotel.getCity();

		System.out.println(hotel);

	}

}