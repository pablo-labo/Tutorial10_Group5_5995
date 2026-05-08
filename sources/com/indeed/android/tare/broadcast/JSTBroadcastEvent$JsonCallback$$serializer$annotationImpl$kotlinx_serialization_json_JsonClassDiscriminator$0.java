package com.indeed.android.tare.broadcast;

import defpackage.l5;
import defpackage.wl7;
import defpackage.z98;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class JSTBroadcastEvent$JsonCallback$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements z98 {
    private final /* synthetic */ String discriminator;

    public JSTBroadcastEvent$JsonCallback$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(String str) {
        str.getClass();
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return z98.class;
    }

    @Override // defpackage.z98
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof z98) && wl7.b(discriminator(), ((z98) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return l5.m("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, ")");
    }
}
