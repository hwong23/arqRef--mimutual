package dev.hwo.framework.adapters.output.file;

import dev.hwo.domain.Prima;
import dev.hwo.domain.ValorCuota;
import dev.hwo.application.ports.output.ValorCuotaOutputPort;

public class ValorCuotaSQLOutAdapter implements ValorCuotaOutputPort {
    @Override
    public Prima fetchPrima (String primaId)
    {
        // SQL conexión ...
        return new Prima( new ValorCuota(1000.12));
    }
}