package com.indeed.android.jsmappservices.bridge;

import defpackage.boa;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.vz0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ModalPresentationMode {
    public static final Companion Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final ModalPresentationMode b;
    public static final ModalPresentationMode c;
    public static final /* synthetic */ ModalPresentationMode[] d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ModalPresentationMode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/ModalPresentationMode;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ModalPresentationMode> serializer() {
            return (KSerializer) ModalPresentationMode.a.getValue();
        }
    }

    static {
        ModalPresentationMode modalPresentationMode = new ModalPresentationMode("BOTTOM", 0);
        b = modalPresentationMode;
        ModalPresentationMode modalPresentationMode2 = new ModalPresentationMode("FULLSCREEN", 1);
        c = modalPresentationMode2;
        d = new ModalPresentationMode[]{modalPresentationMode, modalPresentationMode2};
        Companion = new Companion();
        a = boa.E(qt8.b, new vz0(9));
    }

    public ModalPresentationMode() {
        throw null;
    }

    public static ModalPresentationMode valueOf(String str) {
        return (ModalPresentationMode) Enum.valueOf(ModalPresentationMode.class, str);
    }

    public static ModalPresentationMode[] values() {
        return (ModalPresentationMode[]) d.clone();
    }
}
