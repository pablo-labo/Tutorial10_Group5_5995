package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Module {

    public interface SetupContext {
    }

    public Iterable<? extends Module> getDependencies() {
        return Collections.EMPTY_LIST;
    }

    public abstract String getModuleName();

    public Object getTypeId() {
        return getClass().getName();
    }

    public abstract void setupModule(SetupContext setupContext);

    public abstract Version version();
}
