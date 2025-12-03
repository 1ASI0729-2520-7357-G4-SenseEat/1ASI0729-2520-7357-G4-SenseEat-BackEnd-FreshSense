package com.acme.backendfreshsense.alerts.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String severity;   // critical | warning | info
    private String state;      // active | muted | resolved
    private String title;
    private String message;
    private String source;     // Temp | Humidity | Ethylene | Cleanliness | Oxygen
    private String timeAgo;    // "2m ago", "1h ago", etc.
}

