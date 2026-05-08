package com.indeed.android.jsmappservices.bridge.results;

import defpackage.boa;
import defpackage.ewa;
import defpackage.k7;
import defpackage.o7e;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ActionOverflowResult;", "Lcom/indeed/android/jsmappservices/bridge/results/BridgeResult;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActionOverflowResult extends BridgeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] d = {boa.E(qt8.b, new k7(0)), null};
    public final ActionOverflowResultAction b;
    public final int c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ActionOverflowResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/ActionOverflowResult;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ActionOverflowResult> serializer() {
            return ActionOverflowResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActionOverflowResult(int i, ActionOverflowResultAction actionOverflowResultAction, int i2) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, ActionOverflowResult$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.b = actionOverflowResultAction;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionOverflowResult)) {
            return false;
        }
        ActionOverflowResult actionOverflowResult = (ActionOverflowResult) obj;
        return this.b == actionOverflowResult.b && this.c == actionOverflowResult.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ActionOverflowResult(action=" + this.b + ", selectedRow=" + this.c + ")";
    }

    public ActionOverflowResult(ActionOverflowResultAction actionOverflowResultAction, int i) {
        this.b = actionOverflowResultAction;
        this.c = i;
    }
}
