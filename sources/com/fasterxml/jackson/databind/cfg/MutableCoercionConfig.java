package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableCoercionConfig extends CoercionConfig implements Serializable {
    private static final long serialVersionUID = 1;

    public MutableCoercionConfig() {
    }

    public MutableCoercionConfig copy() {
        return new MutableCoercionConfig(this);
    }

    public MutableCoercionConfig(MutableCoercionConfig mutableCoercionConfig) {
        super(mutableCoercionConfig);
    }
}
