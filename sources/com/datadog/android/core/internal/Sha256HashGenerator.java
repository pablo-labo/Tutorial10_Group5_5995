package com.datadog.android.core.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import defpackage.a32;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.ut0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/core/internal/Sha256HashGenerator;", "Lcom/datadog/android/core/internal/HashGenerator;", "()V", "generate", "", "input", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Sha256HashGenerator implements HashGenerator {
    public static final String SHA_256_HASH_GENERATION_ERROR = "Cannot generate SHA-256 hash.";

    @Override // com.datadog.android.core.internal.HashGenerator
    public String generate(String input) {
        input.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = input.getBytes(a32.b);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            return ut0.s0(bArrDigest, "", AnonymousClass1.INSTANCE, 30);
        } catch (NoSuchAlgorithmException e) {
            InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.Sha256HashGenerator$generate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return Sha256HashGenerator.SHA_256_HASH_GENERATION_ERROR;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.Sha256HashGenerator$generate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }
}
