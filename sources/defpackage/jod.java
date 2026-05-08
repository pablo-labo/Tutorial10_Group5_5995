package defpackage;

import defpackage.hod;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jod implements d65<hod> {
    @Override // javax.inject.Provider
    public final Object get() {
        dmc dmcVar = new dmc();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            ja.k("Null flags");
            return null;
        }
        map.put(jnb.a, new n31(30000L, 86400000L, set));
        if (set == null) {
            ja.k("Null flags");
            return null;
        }
        map.put(jnb.c, new n31(1000L, 86400000L, set));
        if (set == null) {
            ja.k("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(hod.b.b)));
        if (setUnmodifiableSet == null) {
            ja.k("Null flags");
            return null;
        }
        map.put(jnb.b, new n31(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= jnb.values().length) {
            new HashMap();
            return new m31(dmcVar, map);
        }
        r6.g("Not all priorities have been configured");
        return null;
    }
}
