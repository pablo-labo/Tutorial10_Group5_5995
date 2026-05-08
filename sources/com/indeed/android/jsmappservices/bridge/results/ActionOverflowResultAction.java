package com.indeed.android.jsmappservices.bridge.results;

import defpackage.boa;
import defpackage.l7;
import defpackage.o7e;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@o7e
public final class ActionOverflowResultAction {
    public static final Companion Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final ActionOverflowResultAction b;
    public static final ActionOverflowResultAction c;
    public static final /* synthetic */ ActionOverflowResultAction[] d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/results/ActionOverflowResultAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/results/ActionOverflowResultAction;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ActionOverflowResultAction> serializer() {
            return (KSerializer) ActionOverflowResultAction.a.getValue();
        }
    }

    static {
        ActionOverflowResultAction actionOverflowResultAction = new ActionOverflowResultAction("CLICK", 0);
        b = actionOverflowResultAction;
        ActionOverflowResultAction actionOverflowResultAction2 = new ActionOverflowResultAction("CANCEL", 1);
        c = actionOverflowResultAction2;
        d = new ActionOverflowResultAction[]{actionOverflowResultAction, actionOverflowResultAction2};
        Companion = new Companion();
        a = boa.E(qt8.b, new l7(0));
    }

    public ActionOverflowResultAction() {
        throw null;
    }

    public static ActionOverflowResultAction valueOf(String str) {
        return (ActionOverflowResultAction) Enum.valueOf(ActionOverflowResultAction.class, str);
    }

    public static ActionOverflowResultAction[] values() {
        return (ActionOverflowResultAction[]) d.clone();
    }
}
