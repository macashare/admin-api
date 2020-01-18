package com.bdados.adminapi.consumer;

import com.bdados.adminapi.consumer.models.ConsumerGroup;
import com.bdados.adminapi.consumer.models.ConsumerType;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    public List<String> findAllTypes() {
        return List.of(ConsumerType.values()).map(ConsumerType::getValue);
    }

    public List<String> findAllGroups() {
        return List.of(ConsumerGroup.values()).map(ConsumerGroup::getValue);
    }
}
