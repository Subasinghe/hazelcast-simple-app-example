package hazelcastsimpleapp;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastInstanceManager {
    private static HazelcastInstanceManager instance = new HazelcastInstanceManager();
    private HazelcastInstance hazelcastInstance;
    public static HazelcastInstanceManager getInstance() {
        return instance;
    }
    public HazelcastInstance init(Config config) {
        if (hazelcastInstance != null) {
            throw new IllegalStateException("HazelcastInstanceManager has already been initialized");
        }
        hazelcastInstance = Hazelcast.newHazelcastInstance(config);
        return hazelcastInstance;
    }
    public HazelcastInstance getHazelcastInstance() {
        return hazelcastInstance;
    }
    private HazelcastInstanceManager() {
    }
}