package kg.megacom.books.mappers.impl;

import kg.megacom.books.mappers.BookMapper;
import kg.megacom.books.mappers.OperationMapper;
import kg.megacom.books.mappers.ReaderMapper;
import kg.megacom.books.models.Book;
import kg.megacom.books.models.Operation;
import kg.megacom.books.models.dto.BookDto;
import kg.megacom.books.models.dto.OperationDto;

import java.util.ArrayList;
import java.util.List;

public class OperationMapperImpl implements OperationMapper {
    BookMapper bookMapper;
    ReaderMapper readerMapper;


    @Override
    public Operation fromDto(OperationDto operationDto) {
        Operation operation = new Operation();
        operation.setId(operationDto.getId());
        operation.setStartDate(operationDto.getStartDate());
        operation.setEndDate(operationDto.getEndDate());
        operation.setStatus(operationDto.getStatus());
        operation.setBook(bookMapper.fromDto(operationDto.getBook()));
        operation.setReader(readerMapper.fromDto(operationDto.getReader()));

        return operation;
    }

    @Override
    public OperationDto toDto(Operation operation) {
        OperationDto operationDto = new OperationDto();
        operationDto.setId(operation.getId());
        operationDto.setStartDate(operation.getStartDate());
        operationDto.setEndDate(operation.getEndDate());
        operationDto.setStatus(operation.getStatus());
        operationDto.setBook(bookMapper.toDto(operation.getBook()));
        operationDto.setReader(readerMapper.toDto(operation.getReader()));

        return operationDto;
    }

    @Override
    public List<Operation> fromDtos(List<OperationDto> operationDtos) {
        List<Operation> operations = new ArrayList<>();

        for (OperationDto item: operationDtos){
            Operation operation = fromDto(item);
            operations.add(operation);
        }

        return operations;
    }

    @Override
    public List<OperationDto> toDtos(List<Operation> operations) {
        List<OperationDto> operationDtos = new ArrayList<>();

        for (Operation item: operations) {
            OperationDto operationDto = toDto(item);
            operationDtos.add(operationDto);
        }
        return operationDtos;
    }
}
