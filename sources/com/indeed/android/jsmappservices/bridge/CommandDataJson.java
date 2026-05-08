package com.indeed.android.jsmappservices.bridge;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.v40;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/CommandDataJson;", "D", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommandDataJson<D> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final PluginGeneratedSerialDescriptor b;
    public final D a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/CommandDataJson$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/CommandDataJson;", "D", "typeSerial0", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final <D> KSerializer<CommandDataJson<D>> serializer(KSerializer<D> typeSerial0) {
            typeSerial0.getClass();
            return new CommandDataJson$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jsmappservices.bridge.CommandDataJson", null, 1);
        pluginGeneratedSerialDescriptor.k("data", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CommandDataJson(int i, Object obj) {
        if (1 == (i & 1)) {
            this.a = obj;
        } else {
            ewa.M(i, 1, b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommandDataJson) && wl7.b(this.a, ((CommandDataJson) obj).a);
    }

    public final int hashCode() {
        D d = this.a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public final String toString() {
        return v40.e(this.a, "CommandDataJson(data=", ")");
    }
}
