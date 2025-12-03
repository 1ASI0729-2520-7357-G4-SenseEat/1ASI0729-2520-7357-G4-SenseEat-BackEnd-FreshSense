package com.acme.backendfreshsense.alerts.application.internal;
import com.acme.backendfreshsense.alerts.domain.model.aggregates.Alert;
import com.acme.backendfreshsense.alerts.infrastructure.persistence.jpa.AlertRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertService {

    private final AlertRepository repo;

    public AlertService(AlertRepository repo) {
        this.repo = repo;
    }

    public List<Alert> getAll() {
        return repo.findAll();
    }

    public Alert create(Alert alert) {
        return repo.save(alert);
    }

    public Alert update(Long id, Alert alert) {
        alert.setId(id);
        return repo.save(alert);
    }
}
