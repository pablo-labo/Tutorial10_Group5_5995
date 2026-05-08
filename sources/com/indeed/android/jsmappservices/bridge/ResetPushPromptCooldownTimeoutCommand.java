package com.indeed.android.jsmappservices.bridge;

import defpackage.boa;
import defpackage.cn0;
import defpackage.o7e;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ResetPushPromptCooldownTimeoutCommand;", "Lcom/indeed/android/jsmappservices/bridge/Command;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResetPushPromptCooldownTimeoutCommand extends Command {
    public static final ResetPushPromptCooldownTimeoutCommand INSTANCE = new ResetPushPromptCooldownTimeoutCommand();
    public static final /* synthetic */ Lazy<KSerializer<Object>> b = boa.E(qt8.b, new cn0(20));

    public final KSerializer<ResetPushPromptCooldownTimeoutCommand> serializer() {
        return (KSerializer) b.getValue();
    }
}
