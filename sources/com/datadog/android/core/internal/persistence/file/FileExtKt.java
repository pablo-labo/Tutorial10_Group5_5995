package com.datadog.android.core.internal.persistence.file;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.lint.InternalApi;
import defpackage.a32;
import defpackage.gu5;
import defpackage.hb5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.mj8;
import defpackage.qx8;
import defpackage.u63;
import defpackage.vp2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a=\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u001b\u0010\u0010\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000b\u001a#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0012\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\t*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001c\u0010\u000b\u001a#\u0010\u001e\u001a\u00020\t*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010!\u001a\u00020 *\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"\u001a'\u0010&\u001a\u0004\u0018\u00010%*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010)\u001a\u0004\u0018\u00010(*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010*\u001a-\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010+*\u00020\u00012\b\b\u0002\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010-\u001a-\u0010/\u001a\u00020 *\u00020\u00012\u0006\u0010.\u001a\u00020%2\b\b\u0002\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"T", "Ljava/io/File;", "default", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function1;", "lambda", "safeCall", "(Ljava/io/File;Ljava/lang/Object;Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "canWriteSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Z", "canReadSafe", "deleteSafe", "existsSafe", "isFileSafe", "isDirectorySafe", "", "listFilesSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)[Ljava/io/File;", "Ljava/io/FileFilter;", "filter", "(Ljava/io/File;Ljava/io/FileFilter;Lcom/datadog/android/api/InternalLogger;)[Ljava/io/File;", "Ljava/io/FilenameFilter;", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;Ljava/io/FilenameFilter;)[Ljava/io/File;", "", "lengthSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)J", "mkdirsSafe", "dest", "renameToSafe", "(Ljava/io/File;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Z", "Lj6g;", "deleteDirectoryContentsSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "Ljava/nio/charset/Charset;", "charset", "", "readTextSafe", "(Ljava/io/File;Ljava/nio/charset/Charset;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/String;", "", "readBytesSafe", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)[B", "", "readLinesSafe", "(Ljava/io/File;Ljava/nio/charset/Charset;Lcom/datadog/android/api/InternalLogger;)Ljava/util/List;", "text", "writeTextSafe", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;Lcom/datadog/android/api/InternalLogger;)V", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class FileExtKt {

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$canReadSafe$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<File, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.canRead());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$canWriteSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05201 extends mj8 implements Function1<File, Boolean> {
        public static final C05201 INSTANCE = new C05201();

        public C05201() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.canWrite());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$deleteSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05211 extends mj8 implements Function1<File, Boolean> {
        public static final C05211 INSTANCE = new C05211();

        public C05211() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.delete());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$existsSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05221 extends mj8 implements Function1<File, Boolean> {
        public static final C05221 INSTANCE = new C05221();

        public C05221() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.exists());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$isDirectorySafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05231 extends mj8 implements Function1<File, Boolean> {
        public static final C05231 INSTANCE = new C05231();

        public C05231() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.isDirectory());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$isFileSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05241 extends mj8 implements Function1<File, Boolean> {
        public static final C05241 INSTANCE = new C05241();

        public C05241() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.isFile());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$lengthSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Long;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05251 extends mj8 implements Function1<File, Long> {
        public static final C05251 INSTANCE = new C05251();

        public C05251() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(File file) {
            file.getClass();
            return Long.valueOf(file.length());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)[Ljava/io/File;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05261 extends mj8 implements Function1<File, File[]> {
        public static final C05261 INSTANCE = new C05261();

        public C05261() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final File[] invoke(File file) {
            file.getClass();
            return file.listFiles();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)[Ljava/io/File;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements Function1<File, File[]> {
        final /* synthetic */ FileFilter $filter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FileFilter fileFilter) {
            super(1);
            this.$filter = fileFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public final File[] invoke(File file) {
            file.getClass();
            return file.listFiles(this.$filter);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/io/File;)[Ljava/io/File;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements Function1<File, File[]> {
        final /* synthetic */ FilenameFilter $filter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FilenameFilter filenameFilter) {
            super(1);
            this.$filter = filenameFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public final File[] invoke(File file) {
            file.getClass();
            return file.listFiles(this.$filter);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$mkdirsSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05271 extends mj8 implements Function1<File, Boolean> {
        public static final C05271 INSTANCE = new C05271();

        public C05271() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.mkdirs());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$readBytesSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05281 extends mj8 implements Function1<File, byte[]> {
        public static final C05281 INSTANCE = new C05281();

        public C05281() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final byte[] invoke(File file) {
            file.getClass();
            return hb5.S(file);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$readLinesSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05291 extends mj8 implements Function1<File, List<? extends String>> {
        final /* synthetic */ Charset $charset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05291(Charset charset) {
            super(1);
            this.$charset = charset;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<String> invoke(File file) throws IOException {
            file.getClass();
            Charset charset = this.$charset;
            charset.getClass();
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
            try {
                for (String str : new vp2(new qx8(bufferedReader))) {
                    str.getClass();
                    arrayList.add(str);
                    j6g j6gVar = j6g.a;
                }
                j6g j6gVar2 = j6g.a;
                bufferedReader.close();
                return arrayList;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$readTextSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05301 extends mj8 implements Function1<File, String> {
        final /* synthetic */ Charset $charset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05301(Charset charset) {
            super(1);
            this.$charset = charset;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(File file) {
            file.getClass();
            return hb5.T(file, this.$charset);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$renameToSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/File;", "invoke", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05311 extends mj8 implements Function1<File, Boolean> {
        final /* synthetic */ File $dest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05311(File file) {
            super(1);
            this.$dest = file;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.renameTo(this.$dest));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05321 extends mj8 implements gu5<String> {
        final /* synthetic */ File $this_safeCall;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05321(File file) {
            super(0);
            this.$this_safeCall = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("Security exception was thrown for file ", this.$this_safeCall.getPath());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$safeCall$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05332 extends mj8 implements gu5<String> {
        final /* synthetic */ File $this_safeCall;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05332(File file) {
            super(0);
            this.$this_safeCall = file;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.l("Unexpected exception was thrown for file ", this.$this_safeCall.getPath());
        }
    }

    @InternalApi
    public static final boolean canReadSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, AnonymousClass1.INSTANCE)).booleanValue();
    }

    public static final boolean canWriteSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, C05201.INSTANCE)).booleanValue();
    }

    public static final void deleteDirectoryContentsSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        File[] fileArrListFilesSafe = listFilesSafe(file, internalLogger);
        if (fileArrListFilesSafe != null) {
            for (File file2 : fileArrListFilesSafe) {
                deleteSafe(file2, internalLogger);
            }
        }
    }

    public static final boolean deleteSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, C05211.INSTANCE)).booleanValue();
    }

    @InternalApi
    public static final boolean existsSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, C05221.INSTANCE)).booleanValue();
    }

    public static final boolean isDirectorySafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, C05231.INSTANCE)).booleanValue();
    }

    public static final boolean isFileSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, C05241.INSTANCE)).booleanValue();
    }

    public static final long lengthSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Number) safeCall(file, 0L, internalLogger, C05251.INSTANCE)).longValue();
    }

    public static final File[] listFilesSafe(File file, FileFilter fileFilter, InternalLogger internalLogger) {
        file.getClass();
        fileFilter.getClass();
        internalLogger.getClass();
        return (File[]) safeCall(file, null, internalLogger, new AnonymousClass2(fileFilter));
    }

    public static final boolean mkdirsSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, C05271.INSTANCE)).booleanValue();
    }

    public static final byte[] readBytesSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (byte[]) safeCall(file, null, internalLogger, C05281.INSTANCE);
        }
        return null;
    }

    @InternalApi
    public static final List<String> readLinesSafe(File file, Charset charset, InternalLogger internalLogger) {
        file.getClass();
        charset.getClass();
        internalLogger.getClass();
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (List) safeCall(file, null, internalLogger, new C05291(charset));
        }
        return null;
    }

    public static /* synthetic */ List readLinesSafe$default(File file, Charset charset, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = a32.b;
        }
        return readLinesSafe(file, charset, internalLogger);
    }

    @InternalApi
    public static final String readTextSafe(File file, Charset charset, InternalLogger internalLogger) {
        file.getClass();
        charset.getClass();
        internalLogger.getClass();
        if (existsSafe(file, internalLogger) && canReadSafe(file, internalLogger)) {
            return (String) safeCall(file, null, internalLogger, new C05301(charset));
        }
        return null;
    }

    public static /* synthetic */ String readTextSafe$default(File file, Charset charset, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = a32.b;
        }
        return readTextSafe(file, charset, internalLogger);
    }

    public static final boolean renameToSafe(File file, File file2, InternalLogger internalLogger) {
        file.getClass();
        file2.getClass();
        internalLogger.getClass();
        return ((Boolean) safeCall(file, Boolean.FALSE, internalLogger, new C05311(file2))).booleanValue();
    }

    private static final <T> T safeCall(File file, T t, InternalLogger internalLogger, Function1<? super File, ? extends T> function1) {
        try {
            return function1.invoke(file);
        } catch (SecurityException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05321(file), (Throwable) e, false, (Map) null, 48, (Object) null);
            return t;
        } catch (Exception e2) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05332(file), (Throwable) e2, false, (Map) null, 48, (Object) null);
            return t;
        }
    }

    public static final void writeTextSafe(File file, String str, Charset charset, InternalLogger internalLogger) {
        file.getClass();
        str.getClass();
        charset.getClass();
        internalLogger.getClass();
        if (existsSafe(file, internalLogger) && canWriteSafe(file, internalLogger)) {
            safeCall(file, null, internalLogger, new C05341(str, charset));
        }
    }

    public static /* synthetic */ void writeTextSafe$default(File file, String str, Charset charset, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = a32.b;
        }
        writeTextSafe(file, str, charset, internalLogger);
    }

    public static final File[] listFilesSafe(File file, InternalLogger internalLogger) {
        file.getClass();
        internalLogger.getClass();
        return (File[]) safeCall(file, null, internalLogger, C05261.INSTANCE);
    }

    @InternalApi
    public static final File[] listFilesSafe(File file, InternalLogger internalLogger, FilenameFilter filenameFilter) {
        file.getClass();
        internalLogger.getClass();
        filenameFilter.getClass();
        return (File[]) safeCall(file, null, internalLogger, new AnonymousClass3(filenameFilter));
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.persistence.file.FileExtKt$writeTextSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/File;", "Lj6g;", "invoke", "(Ljava/io/File;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C05341 extends mj8 implements Function1<File, j6g> {
        final /* synthetic */ Charset $charset;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05341(String str, Charset charset) {
            super(1);
            this.$text = str;
            this.$charset = charset;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(File file) throws IOException {
            file.getClass();
            String str = this.$text;
            Charset charset = this.$charset;
            str.getClass();
            charset.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                hb5.X(fileOutputStream, str, charset);
                j6g j6gVar = j6g.a;
                fileOutputStream.close();
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(File file) throws IOException {
            invoke2(file);
            return j6g.a;
        }
    }
}
