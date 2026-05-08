package com.rivereactnative;

import defpackage.bg;
import defpackage.l5;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.rivereactnative.a$a, reason: collision with other inner class name */
    public static final class C0190a extends a {
        public final boolean a;

        public C0190a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0190a) && this.a == ((C0190a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return "AutoBind(autoBind=" + this.a + ")";
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1653671279;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class c extends a {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return bg.d(this.a, "Index(index=", ")");
        }
    }

    public static final class d extends a {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("Name(name=", this.a, ")");
        }
    }
}
