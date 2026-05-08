package com.facebook.react.bridge;

import defpackage.f84;

/* JADX INFO: loaded from: classes2.dex */
@f84
public interface NativeModule {
    @Deprecated
    default boolean canOverrideExistingModule() {
        return false;
    }

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
