package dev.hwo.application.ports.output;

import dev.hwo.domain.Prima;

public interface ValorCuotaOutputPort {
    Prima fetchPrima (String primaId);
}
