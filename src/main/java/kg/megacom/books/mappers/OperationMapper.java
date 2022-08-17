package kg.megacom.books.mappers;

import kg.megacom.books.models.Operation;
import kg.megacom.books.models.dto.OperationDto;

import java.util.List;

public interface OperationMapper {

    Operation fromDto (OperationDto operationDto);
    OperationDto toDto (Operation operation);

    List<Operation> fromDtos(List<OperationDto> operationDtos);
    List<OperationDto> toDtos(List<Operation> operations);
}
