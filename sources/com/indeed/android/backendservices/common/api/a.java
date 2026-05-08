package com.indeed.android.backendservices.common.api;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public final String a;
    public final String b;
    public final String c;

    /* JADX INFO: renamed from: com.indeed.android.backendservices.common.api.a$a, reason: collision with other inner class name */
    public static final class C0162a extends a {
        public C0162a() {
            super(SessionEndedMetric.PROCESS_TYPE_VALUE, "App status error");
        }

        @Override // com.indeed.android.backendservices.common.api.a
        public final String a() {
            return this.a.concat("::0");
        }
    }

    public static final class b extends a {
        public final int d;

        public b(int i) {
            super("rsp", "Bad HTTP Response code");
            this.d = i;
        }

        @Override // com.indeed.android.backendservices.common.api.a
        public final String a() {
            return this.a + "::" + this.d;
        }
    }

    public static final class c extends a {
        public static final c d = new c("cl", "Client error");
    }

    public static final class d extends a {
        public static final d d = new d("mr", "Malformed response");
    }

    public static final class e extends a {
        public e() {
            super("net", "Network error");
        }

        @Override // com.indeed.android.backendservices.common.api.a
        public final String a() {
            return this.a.concat("::0");
        }
    }

    public static final class f extends a {
        @Override // com.indeed.android.backendservices.common.api.a
        public final String a() {
            return this.a.concat("::0");
        }
    }

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str;
    }

    public String a() {
        return this.c;
    }
}
