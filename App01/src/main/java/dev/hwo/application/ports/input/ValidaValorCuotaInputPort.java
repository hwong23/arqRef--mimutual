package dev.hwo.application.ports.input;


import java.util.function.Predicate;

import dev.hwo.application.usecases.ValidarValorCuotaUseCase;
import dev.hwo.domain.Prima;

public class ValidaValorCuotaInputPort implements ValidarValorCuotaUseCase {
    @Override
    public boolean validaValorCuotaPrima (Predicate<Prima> prima) {
        //return fetchPrima ("idPrimaXXX");
        return false;
        
    }
}
