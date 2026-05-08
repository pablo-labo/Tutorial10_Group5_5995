package com.indeed.android.jsmappservices.bridge;

import defpackage.boa;
import defpackage.fc2;
import defpackage.o7e;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
public abstract class Command {
    public static final Companion Companion = new Companion();
    public static final Lazy<KSerializer<Object>> a = boa.E(qt8.b, new fc2(0));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/Command$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/Command;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<Command> serializer() {
            return (KSerializer) Command.a.getValue();
        }
    }
}
