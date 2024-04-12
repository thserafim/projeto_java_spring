package one.digitalinnovation.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // VAI GERAR IDS AUTOMATICOS EM ORDEM
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PhoneType type;
	
	@Column(nullable = false)
	private String number;

}
