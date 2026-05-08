package com.indeed.android.jsmappservices.bridge;

import defpackage.ag3;
import defpackage.boa;
import defpackage.ewa;
import defpackage.o7e;
import defpackage.qt8;
import defpackage.u40;
import defpackage.wl7;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ShowModalWithWebviewData;", "", "Companion", "$serializer", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowModalWithWebviewData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy<KSerializer<Object>>[] d = {null, null, boa.E(qt8.b, new ag3(11))};
    public final String a;
    public final String b;
    public final ModalPresentationMode c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/jsmappservices/bridge/ShowModalWithWebviewData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/jsmappservices/bridge/ShowModalWithWebviewData;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ShowModalWithWebviewData> serializer() {
            return ShowModalWithWebviewData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShowModalWithWebviewData(int i, String str, String str2, ModalPresentationMode modalPresentationMode) {
        if (1 != (i & 1)) {
            ewa.M(i, 1, ShowModalWithWebviewData$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = modalPresentationMode;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowModalWithWebviewData)) {
            return false;
        }
        ShowModalWithWebviewData showModalWithWebviewData = (ShowModalWithWebviewData) obj;
        return wl7.b(this.a, showModalWithWebviewData.a) && wl7.b(this.b, showModalWithWebviewData.b) && this.c == showModalWithWebviewData.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ModalPresentationMode modalPresentationMode = this.c;
        return iHashCode2 + (modalPresentationMode != null ? modalPresentationMode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("ShowModalWithWebviewData(url=", this.a, ", title=", this.b, ", presentationMode=");
        sbF.append(this.c);
        sbF.append(")");
        return sbF.toString();
    }

    public ShowModalWithWebviewData(String str, String str2, ModalPresentationMode modalPresentationMode) {
        this.a = str;
        this.b = str2;
        this.c = modalPresentationMode;
    }
}
