package com.indeed.android.reactnative.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.b0;
import defpackage.boa;
import defpackage.dp7;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.q9a;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.vh8;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/indeed/android/reactnative/turbo/NativeJSTAccountStatus;", "Lcom/indeed/android/reactnative/turbo/NativeJSTAccountStatusSpec;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lq9a;", "getNullableAdapter", "()Lq9a;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "getAccountStatus", "()Lcom/facebook/react/bridge/WritableMap;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "adapter", "Companion", "a", "rnbrownfield_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeJSTAccountStatus extends NativeJSTAccountStatusSpec implements xh8 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String NAME = "NativeJSTAccountStatus";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;

    /* JADX INFO: renamed from: com.indeed.android.reactnative.turbo.NativeJSTAccountStatus$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class b extends mj8 implements gu5<q9a> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NativeJSTAccountStatus nativeJSTAccountStatus) {
            super(0);
            this.$this_inject = nativeJSTAccountStatus;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, q9a] */
        @Override // defpackage.gu5
        public final q9a invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(q9a.class), a9cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeJSTAccountStatus(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.adapter = boa.E(qt8.a, new b(this));
    }

    private final q9a getAdapter() {
        return (q9a) this.adapter.getValue();
    }

    private final q9a getNullableAdapter() {
        try {
            return getAdapter();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.indeed.android.reactnative.turbo.NativeJSTAccountStatusSpec
    public WritableMap getAccountStatus() {
        q9a nullableAdapter = getNullableAdapter();
        if (nullableAdapter == null) {
            b0.u("ADAPTER_NOT_REGISTERED: NativeJSTAccountStatusAdapter");
            return null;
        }
        dp7 dp7VarA = nullableAdapter.a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putBoolean("isLoggedIn", dp7VarA.a);
        String str = dp7VarA.b;
        if (str == null) {
            writableMapCreateMap.putNull("id");
        } else {
            writableMapCreateMap.putString("id", str);
        }
        String str2 = dp7VarA.c;
        if (str2 == null) {
            writableMapCreateMap.putNull("accountId");
        } else {
            writableMapCreateMap.putString("accountId", str2);
        }
        String str3 = dp7VarA.d;
        if (str3 == null) {
            writableMapCreateMap.putNull("emailAddress");
        } else {
            writableMapCreateMap.putString("emailAddress", str3);
        }
        writableMapCreateMap.putBoolean("isConfirmed", dp7VarA.e);
        Double d = dp7VarA.f;
        if (d == null) {
            writableMapCreateMap.putNull("creationDate");
            return writableMapCreateMap;
        }
        writableMapCreateMap.putDouble("creationDate", d.doubleValue());
        return writableMapCreateMap;
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.reactnative.turbo.NativeJSTAccountStatusSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeJSTAccountStatus";
    }
}
