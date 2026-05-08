package com.facebook.react.runtime;

import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.ComponentNameResolver;
import defpackage.s55;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ComponentNameResolver {
    public final /* synthetic */ ReactInstance a;

    public b(ReactInstance reactInstance) {
        this.a = reactInstance;
    }

    @Override // com.facebook.react.uimanager.ComponentNameResolver
    public final String[] getComponentNames() {
        HashSet hashSet = (HashSet) this.a.d.a();
        if (!hashSet.isEmpty()) {
            return (String[]) hashSet.toArray(new String[0]);
        }
        ReactInstance.b bVar = ReactInstance.h;
        s55.f("ReactInstance", "No ViewManager names found");
        return new String[0];
    }
}
