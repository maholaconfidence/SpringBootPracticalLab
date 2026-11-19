package org.example.springbootpracticallab.dto;

public record StudentRequest(
        String firstName,
        String lastName,
        String email,
        Long departmentId
) {
}
