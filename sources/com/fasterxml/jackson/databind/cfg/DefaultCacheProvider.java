package com.fasterxml.jackson.databind.cfg;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.LookupCache;
import com.fasterxml.jackson.databind.util.TypeKey;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultCacheProvider implements CacheProvider {
    private static final DefaultCacheProvider DEFAULT = new DefaultCacheProvider(2000, 4000, UiRumDebugListener.DEFAULT_ALPHA);
    private static final long serialVersionUID = 1;
    protected final int _maxDeserializerCacheSize;
    protected final int _maxSerializerCacheSize;
    protected final int _maxTypeFactoryCacheSize;

    public DefaultCacheProvider(int i, int i2, int i3) {
        this._maxDeserializerCacheSize = i;
        this._maxSerializerCacheSize = i2;
        this._maxTypeFactoryCacheSize = i3;
    }

    public static CacheProvider defaultInstance() {
        return DEFAULT;
    }

    public <K, V> LookupCache<K, V> _buildCache(int i) {
        return new LRUMap(Math.min(64, i >> 2), i);
    }

    @Override // com.fasterxml.jackson.databind.cfg.CacheProvider
    public LookupCache<JavaType, JsonDeserializer<Object>> forDeserializerCache(DeserializationConfig deserializationConfig) {
        return _buildCache(this._maxDeserializerCacheSize);
    }

    @Override // com.fasterxml.jackson.databind.cfg.CacheProvider
    public LookupCache<TypeKey, JsonSerializer<Object>> forSerializerCache(SerializationConfig serializationConfig) {
        return _buildCache(this._maxSerializerCacheSize);
    }

    @Override // com.fasterxml.jackson.databind.cfg.CacheProvider
    public LookupCache<Object, JavaType> forTypeFactory() {
        return _buildCache(this._maxTypeFactoryCacheSize);
    }
}
