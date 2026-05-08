package com.indeed.android.uiplugin.oneoff;

import defpackage.l5;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "InvalidCallbackId", "CallbackAlreadyExists", "CallbackNotFound", "Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError$CallbackAlreadyExists;", "Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError$CallbackNotFound;", "Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError$InvalidCallbackId;", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JSONCallbackError extends Exception {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError$CallbackAlreadyExists;", "Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CallbackAlreadyExists extends JSONCallbackError {
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallbackAlreadyExists(String str) {
            super("Callback with ID '" + str + "' already exists");
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallbackAlreadyExists) && wl7.b(this.id, ((CallbackAlreadyExists) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return l5.m("CallbackAlreadyExists(id=", this.id, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError$CallbackNotFound;", "Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CallbackNotFound extends JSONCallbackError {
        private final String id;

        public CallbackNotFound(String str) {
            super(l5.m("Callback with ID '", str, "' not found"));
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallbackNotFound) && wl7.b(this.id, ((CallbackNotFound) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return l5.m("CallbackNotFound(id=", this.id, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError$InvalidCallbackId;", "Lcom/indeed/android/uiplugin/oneoff/JSONCallbackError;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidCallbackId extends JSONCallbackError {
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidCallbackId(String str) {
            super("Invalid callback ID: '" + str + "'");
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidCallbackId) && wl7.b(this.id, ((InvalidCallbackId) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return l5.m("InvalidCallbackId(id=", this.id, ")");
        }
    }
}
