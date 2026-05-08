package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableConfigOverride extends ConfigOverride implements Serializable {
    private static final long serialVersionUID = 1;

    public MutableConfigOverride() {
    }

    public MutableConfigOverride copy() {
        return new MutableConfigOverride(this);
    }

    public MutableConfigOverride(MutableConfigOverride mutableConfigOverride) {
        super(mutableConfigOverride);
    }
}
