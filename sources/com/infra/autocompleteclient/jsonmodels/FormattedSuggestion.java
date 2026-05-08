package com.infra.autocompleteclient.jsonmodels;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/FormattedSuggestion;", "PayloadType", "", "Companion", "$serializer", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class FormattedSuggestion<PayloadType> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final /* synthetic */ PluginGeneratedSerialDescriptor d;
    public final List<Match> a;
    public final String b;
    public final PayloadType c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/FormattedSuggestion$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/autocompleteclient/jsonmodels/FormattedSuggestion;", "T0", "typeSerial0", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public final <T0> KSerializer<FormattedSuggestion<T0>> serializer(KSerializer<T0> typeSerial0) {
            typeSerial0.getClass();
            return new FormattedSuggestion$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.autocompleteclient.jsonmodels.FormattedSuggestion", null, 3);
        pluginGeneratedSerialDescriptor.k("matches", false);
        pluginGeneratedSerialDescriptor.k("suggestion", false);
        pluginGeneratedSerialDescriptor.k("payload", false);
        d = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sy3
    public /* synthetic */ FormattedSuggestion(int i, List list, String str, Object obj) {
        if (7 != (i & 7)) {
            ewa.M(i, 7, d);
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedSuggestion)) {
            return false;
        }
        FormattedSuggestion formattedSuggestion = (FormattedSuggestion) obj;
        return wl7.b(this.a, formattedSuggestion.a) && wl7.b(this.b, formattedSuggestion.b) && wl7.b(this.c, formattedSuggestion.c);
    }

    public final int hashCode() {
        List<Match> list = this.a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        PayloadType payloadtype = this.c;
        return iHashCode2 + (payloadtype != null ? payloadtype.hashCode() : 0);
    }

    public final String toString() {
        return "FormattedSuggestion(matches=" + this.a + ", suggestion=" + this.b + ", payload=" + this.c + ")";
    }
}
