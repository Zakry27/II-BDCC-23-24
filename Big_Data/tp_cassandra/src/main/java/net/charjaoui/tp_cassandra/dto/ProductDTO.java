package net.charjaoui.tp_cassandra.dto;

import java.util.UUID;

public record ProductDTO(UUID id, String name, String description, double price) {}