package org.openmrs.module.registrationcore.api.mpi.openempi;

import org.openmrs.Patient;

public class OpenEmpiPatient extends Patient{

    private boolean mpiPatient;

    public boolean getMpiPatient() {
        return mpiPatient;
    }

    public void setMpiPatient(boolean mpiPatient) {
        this.mpiPatient = mpiPatient;
    }
}
