package io.pillopl.books.domain;

import lombok.Value;

import java.util.UUID;

@Value
//TODO add not null
class LibraryBranchId {

    final UUID libraryBranchId;
}
