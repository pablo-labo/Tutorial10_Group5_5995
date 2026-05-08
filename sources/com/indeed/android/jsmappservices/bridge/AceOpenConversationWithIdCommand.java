package com.indeed.android.jsmappservices.bridge;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.wl7;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/AceOpenConversationWithIdCommand;", "Lcom/indeed/android/jsmappservices/bridge/Command;", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AceOpenConversationWithIdCommand extends Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final AceOpenConversationWithIdData b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/AceOpenConversationWithIdCommand$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/AceOpenConversationWithIdCommand;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AceOpenConversationWithIdCommand> serializer() {
            return AceOpenConversationWithIdCommand$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AceOpenConversationWithIdCommand(int i, AceOpenConversationWithIdData aceOpenConversationWithIdData) {
        if (1 == (i & 1)) {
            this.b = aceOpenConversationWithIdData;
        } else {
            ewa.M(i, 1, AceOpenConversationWithIdCommand$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AceOpenConversationWithIdData getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AceOpenConversationWithIdCommand) && wl7.b(this.b, ((AceOpenConversationWithIdCommand) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AceOpenConversationWithIdCommand(data=" + this.b + ")";
    }

    public AceOpenConversationWithIdCommand(AceOpenConversationWithIdData aceOpenConversationWithIdData) {
        aceOpenConversationWithIdData.getClass();
        this.b = aceOpenConversationWithIdData;
    }
}
