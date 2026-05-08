package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;
import defpackage.t40;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> implements Serializable {
    private static final long serialVersionUID = 1;
    protected int _enabled;

    public JacksonFeatureSet(int i) {
        this._enabled = i;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length > 31) {
            t40.q("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{fArr[0].getClass().getName(), Integer.valueOf(fArr.length)});
            return null;
        }
        int mask = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                mask |= f.getMask();
            }
        }
        return new JacksonFeatureSet<>(mask);
    }

    public boolean isEnabled(F f) {
        return (this._enabled & f.getMask()) != 0;
    }

    public JacksonFeatureSet<F> with(F f) {
        int mask = f.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }
}
